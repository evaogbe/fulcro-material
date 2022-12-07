(ns ogbe.fulcro.mui.icons.support-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SupportRounded" :default SupportRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-support-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupportRounded)))