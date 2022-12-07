(ns ogbe.fulcro.mui.icons.library-music
  #?(:cljs (:require
            ["@mui/icons-material/LibraryMusic" :default LibraryMusic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-library-music
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LibraryMusic)))