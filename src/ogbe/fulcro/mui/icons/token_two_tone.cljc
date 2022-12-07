(ns ogbe.fulcro.mui.icons.token-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TokenTwoTone" :default TokenTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-token-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TokenTwoTone)))