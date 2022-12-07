(ns ogbe.fulcro.mui.icons.attractions
  #?(:cljs (:require
            ["@mui/icons-material/Attractions" :default Attractions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attractions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Attractions)))