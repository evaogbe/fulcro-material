(ns ogbe.fulcro.mui.icons.auto-graph-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AutoGraphSharp" :default AutoGraphSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-graph-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoGraphSharp)))