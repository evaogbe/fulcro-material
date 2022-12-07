(ns ogbe.fulcro.mui.icons.view-compact
  #?(:cljs (:require
            ["@mui/icons-material/ViewCompact" :default ViewCompact]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-compact
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewCompact)))