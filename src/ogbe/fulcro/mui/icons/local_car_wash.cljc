(ns ogbe.fulcro.mui.icons.local-car-wash
  #?(:cljs (:require
            ["@mui/icons-material/LocalCarWash" :default LocalCarWash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-car-wash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalCarWash)))