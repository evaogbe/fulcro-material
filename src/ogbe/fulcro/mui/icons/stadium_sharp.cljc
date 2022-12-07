(ns ogbe.fulcro.mui.icons.stadium-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StadiumSharp" :default StadiumSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stadium-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StadiumSharp)))