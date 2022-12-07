(ns ogbe.fulcro.mui.icons.read-more-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReadMoreSharp" :default ReadMoreSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-read-more-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReadMoreSharp)))