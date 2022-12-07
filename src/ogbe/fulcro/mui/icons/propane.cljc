(ns ogbe.fulcro.mui.icons.propane
  #?(:cljs (:require
            ["@mui/icons-material/Propane" :default Propane]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-propane
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Propane)))