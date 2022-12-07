(ns ogbe.fulcro.mui.icons.margin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MarginSharp" :default MarginSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-margin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarginSharp)))