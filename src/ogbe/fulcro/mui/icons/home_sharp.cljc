(ns ogbe.fulcro.mui.icons.home-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HomeSharp" :default HomeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HomeSharp)))