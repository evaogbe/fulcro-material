(ns ogbe.fulcro.mui.icons.clear-all-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ClearAllSharp" :default ClearAllSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-all-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearAllSharp)))