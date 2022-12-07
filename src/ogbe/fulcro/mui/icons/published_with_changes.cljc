(ns ogbe.fulcro.mui.icons.published-with-changes
  #?(:cljs (:require
            ["@mui/icons-material/PublishedWithChanges" :default PublishedWithChanges]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-published-with-changes
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublishedWithChanges)))