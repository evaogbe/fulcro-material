(ns ogbe.fulcro.mui.icons.colorize-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ColorizeSharp" :default ColorizeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-colorize-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ColorizeSharp)))