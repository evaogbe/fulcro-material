(ns ogbe.fulcro.mui.icons.saved-search
  #?(:cljs (:require
            ["@mui/icons-material/SavedSearch" :default SavedSearch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-saved-search
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavedSearch)))