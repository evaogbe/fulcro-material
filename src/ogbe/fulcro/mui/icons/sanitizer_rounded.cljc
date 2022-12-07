(ns ogbe.fulcro.mui.icons.sanitizer-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SanitizerRounded" :default SanitizerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sanitizer-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SanitizerRounded)))