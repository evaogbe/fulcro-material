(ns ogbe.fulcro.mui.icons.flaky-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FlakySharp" :default FlakySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flaky-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlakySharp)))