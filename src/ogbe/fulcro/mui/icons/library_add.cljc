(ns ogbe.fulcro.mui.icons.library-add
  #?(:cljs (:require
            ["@mui/icons-material/LibraryAdd" :default LibraryAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-library-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LibraryAdd)))