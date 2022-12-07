(ns ogbe.fulcro.mui.icons.sanitizer
  #?(:cljs (:require
            ["@mui/icons-material/Sanitizer" :default Sanitizer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sanitizer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sanitizer)))