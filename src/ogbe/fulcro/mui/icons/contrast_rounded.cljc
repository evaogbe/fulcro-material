(ns ogbe.fulcro.mui.icons.contrast-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ContrastRounded" :default ContrastRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contrast-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContrastRounded)))