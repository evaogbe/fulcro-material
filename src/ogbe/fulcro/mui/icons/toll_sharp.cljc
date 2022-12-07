(ns ogbe.fulcro.mui.icons.toll-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TollSharp" :default TollSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toll-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TollSharp)))