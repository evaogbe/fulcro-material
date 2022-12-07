(ns ogbe.fulcro.mui.icons.expand-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ExpandSharp" :default ExpandSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandSharp)))