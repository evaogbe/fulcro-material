(ns ogbe.fulcro.mui.icons.more-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MoreSharp" :default MoreSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoreSharp)))