(ns ogbe.fulcro.mui.icons.gif-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GifOutlined" :default GifOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GifOutlined)))