(ns ogbe.fulcro.mui.icons.chalet
  #?(:cljs (:require
            ["@mui/icons-material/Chalet" :default Chalet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chalet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Chalet)))