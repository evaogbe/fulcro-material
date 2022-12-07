(ns ogbe.fulcro.mui.icons.sanitizer-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SanitizerSharp" :default SanitizerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sanitizer-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SanitizerSharp)))