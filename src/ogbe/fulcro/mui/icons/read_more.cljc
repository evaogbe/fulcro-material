(ns ogbe.fulcro.mui.icons.read-more
  #?(:cljs (:require
            ["@mui/icons-material/ReadMore" :default ReadMore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-read-more
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReadMore)))