(ns ogbe.fulcro.mui.icons.attribution-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AttributionTwoTone" :default AttributionTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attribution-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttributionTwoTone)))