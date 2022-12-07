(ns ogbe.fulcro.mui.icons.clear-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ClearSharp" :default ClearSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearSharp)))