(ns ogbe.fulcro.mui.icons.wc-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WcTwoTone" :default WcTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wc-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WcTwoTone)))