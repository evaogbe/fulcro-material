(ns ogbe.fulcro.mui.icons.restore
  #?(:cljs (:require
            ["@mui/icons-material/Restore" :default Restore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restore
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Restore)))