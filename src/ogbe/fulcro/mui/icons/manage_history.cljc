(ns ogbe.fulcro.mui.icons.manage-history
  #?(:cljs (:require
            ["@mui/icons-material/ManageHistory" :default ManageHistory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-manage-history
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ManageHistory)))