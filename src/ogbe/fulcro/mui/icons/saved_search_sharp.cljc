(ns ogbe.fulcro.mui.icons.saved-search-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SavedSearchSharp" :default SavedSearchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-saved-search-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavedSearchSharp)))