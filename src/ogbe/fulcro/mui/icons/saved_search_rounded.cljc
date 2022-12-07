(ns ogbe.fulcro.mui.icons.saved-search-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SavedSearchRounded" :default SavedSearchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-saved-search-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavedSearchRounded)))