(ns ogbe.fulcro.mui.icons.bento-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BentoSharp" :default BentoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bento-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BentoSharp)))