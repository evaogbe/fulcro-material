(ns ogbe.fulcro.mui.icons.read-more-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReadMoreRounded" :default ReadMoreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-read-more-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReadMoreRounded)))