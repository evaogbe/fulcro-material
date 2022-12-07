(ns ogbe.fulcro.mui.icons.pending-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PendingSharp" :default PendingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingSharp)))