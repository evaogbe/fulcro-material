(ns ogbe.fulcro.mui.icons.attribution-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AttributionSharp" :default AttributionSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attribution-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttributionSharp)))