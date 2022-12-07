(ns ogbe.fulcro.mui.icons.snowmobile
  #?(:cljs (:require
            ["@mui/icons-material/Snowmobile" :default Snowmobile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snowmobile
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Snowmobile)))