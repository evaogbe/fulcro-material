(ns ogbe.fulcro.mui.icons.wb-cloudy
  #?(:cljs (:require
            ["@mui/icons-material/WbCloudy" :default WbCloudy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-cloudy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbCloudy)))