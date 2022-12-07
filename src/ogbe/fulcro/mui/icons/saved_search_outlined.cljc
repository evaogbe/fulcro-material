(ns ogbe.fulcro.mui.icons.saved-search-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SavedSearchOutlined" :default SavedSearchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-saved-search-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavedSearchOutlined)))