(ns ogbe.fulcro.mui.icons.gif-box-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GifBoxOutlined" :default GifBoxOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-box-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifBoxOutlined)))