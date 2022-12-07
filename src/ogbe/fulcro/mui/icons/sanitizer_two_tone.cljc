(ns ogbe.fulcro.mui.icons.sanitizer-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SanitizerTwoTone" :default SanitizerTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sanitizer-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SanitizerTwoTone)))