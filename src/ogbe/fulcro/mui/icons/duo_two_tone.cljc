(ns ogbe.fulcro.mui.icons.duo-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DuoTwoTone" :default DuoTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-duo-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DuoTwoTone)))