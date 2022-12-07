(ns ogbe.fulcro.mui.icons.php-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PhpTwoTone" :default PhpTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-php-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhpTwoTone)))