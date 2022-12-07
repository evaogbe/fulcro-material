(ns ogbe.fulcro.mui.icons.colorize-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ColorizeOutlined" :default ColorizeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-colorize-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ColorizeOutlined)))