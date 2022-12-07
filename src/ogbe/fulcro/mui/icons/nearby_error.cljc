(ns ogbe.fulcro.mui.icons.nearby-error
  #?(:cljs (:require
            ["@mui/icons-material/NearbyError" :default NearbyError]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nearby-error
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NearbyError)))