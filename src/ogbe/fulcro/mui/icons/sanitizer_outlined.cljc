(ns ogbe.fulcro.mui.icons.sanitizer-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SanitizerOutlined" :default SanitizerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sanitizer-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SanitizerOutlined)))