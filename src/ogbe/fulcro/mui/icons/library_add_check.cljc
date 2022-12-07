(ns ogbe.fulcro.mui.icons.library-add-check
  #?(:cljs (:require
            ["@mui/icons-material/LibraryAddCheck" :default LibraryAddCheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-library-add-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LibraryAddCheck)))