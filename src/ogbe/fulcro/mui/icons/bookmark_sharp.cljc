(ns ogbe.fulcro.mui.icons.bookmark-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BookmarkSharp" :default BookmarkSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bookmark-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookmarkSharp)))