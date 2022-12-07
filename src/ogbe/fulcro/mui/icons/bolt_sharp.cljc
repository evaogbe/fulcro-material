(ns ogbe.fulcro.mui.icons.bolt-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BoltSharp" :default BoltSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bolt-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BoltSharp)))