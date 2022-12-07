(ns ogbe.fulcro.mui.icons.manage-search
  #?(:cljs (:require
            ["@mui/icons-material/ManageSearch" :default ManageSearch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-manage-search
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ManageSearch)))