(ns ogbe.fulcro.mui.icons.shower-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShowerSharp" :default ShowerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shower-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShowerSharp)))