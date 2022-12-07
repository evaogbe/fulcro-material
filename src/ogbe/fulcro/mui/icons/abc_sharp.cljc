(ns ogbe.fulcro.mui.icons.abc-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AbcSharp" :default AbcSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-abc-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AbcSharp)))